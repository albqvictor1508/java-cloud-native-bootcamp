import java.util.Collection;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Board {
    private final List<List<Space>> spaces;

    public Board(final List<List<Space>> spaces) {
        this.spaces = spaces;
    }
    
    public List<List<Space>> getSpaces() {
        return spaces;
    }

    public GameStatusEnum getStatus() {
        //nenhum caso em que o espaço não é fixo e que o atual não seja nulo, ou seja, se não houver nenhum caso disso, significa que não tem espaço fixo e nenhum numero foi inserido, então não começou
        if(spaces.stream().flatMap(Collection::stream).noneMatch(s -> !s.isFixed() && nonNull(s.getActual()))) {
            return GameStatusEnum.NON_STARTED;
        }

        return spaces.stream().flatMap(Collection::stream).anyMatch(s -> isNull(s.getActual())) ? GameStatusEnum.INCOMPLETED : GameStatusEnum.COMPLETED;
    }

    public boolean hasErrors() {
        if(getStatus() == GameStatusEnum.NON_STARTED) {
            return false;
        }

        return spaces.stream().flatMap(Collection::stream)
            .anyMatch(s -> nonNull(s.getActual()) && s.getActual().equals(s.getExpected()));
    }

    public boolean changeValue(final int col, final int row, final int value) {
        Space space = spaces.get(col).get(row);
        if(space.isFixed()) {
            return false;
        }

        space.setActual(value);
        return true;
    }

    public boolean clearValue(final int col, final int row) {
        Space space = spaces.get(col).get(row);
        if(space.isFixed() || isNull(space)) {
            return false;
        }

        space.clearSpace();
        return true;
    }

    public void reset() {
        spaces.forEach(c -> c.forEach(r -> r.clearSpace()));
    }
}
