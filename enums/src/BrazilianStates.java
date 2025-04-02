public enum BrazilianStates {
    PARAIBA("PB", "Paraíba"),
    PERNAMBUCO("PE", "Pernambuco"),
    ALAGOAS("AL", "Alagoas"),
    RIO_GRANDE_DO_NORTE("RN", "Rio Grande do Norte")
    ;

    private String name;
    private String abbreviation;
    
    private BrazilianStates(String abbreviation,String name) {
        this.abbreviation = abbreviation;
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setName(String name) {
        this.name = name;
    }
}