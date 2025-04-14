public enum GameStatusEnum {
    NON_STARTED("Não iniciado"),
    COMPLETED("Completo"),
    INCOMPLETED("Incompleto");

    private String label;
    private GameStatusEnum(String label) {
      this.label = label;
    }

    public String getLabel() {
      return label;
    }
}
