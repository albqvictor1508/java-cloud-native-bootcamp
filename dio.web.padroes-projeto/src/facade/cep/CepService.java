package facade.cep;

public class CepService {
    private static CepService instance = new CepService();
    private CepService() {
      super();
    }

    public static CepService getInstance() {
        return instance;
    }

    public String getCityByCep(Long cep) {
        return "Sapé";
    }

    public String getStateByCep(Long cep) {
        return "Paraíba";
    }
}
