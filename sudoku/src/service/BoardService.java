package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Board;
import model.GameStatusEnum;
import model.Space;

public class BoardService {
    private final static int BOARD_LIMIT = 9;
    private final Board board;

    public BoardService(final Map<String, String> gameConfig) {
        this.board = new Board(initBoard(gameConfig));
    }

    public List<List<Space>> getSpaces() {
        return this.board.getSpaces();
    }

    public boolean hasErrors() {
        return this.board.hasErrors();
    }

    public GameStatusEnum getStatus() {
        return board.getStatus();
    }

    public boolean gameIsFinished() {
        return board.gameIsFinished();
    }

    public void reset() {
        board.reset();
    }

    private List<List<Space>> initBoard(Map<String, String> gameConfig) {
        List<List<Space>> spaces = new ArrayList<>();
        for(int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for(int j = 0; j < BOARD_LIMIT; j++) {
                String positionsConfig = gameConfig.get("%s %s".formatted(i,j));
                int expected = Integer.parseInt(positionsConfig.split(",")[0]);
                boolean fixed = Boolean.parseBoolean(positionsConfig.split(",")[1]);
                Space currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);
            }
            System.out.println("O jogo está pronto para começar!");
        }
        return spaces;
    }
}
