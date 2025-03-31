
public class ConversorTemperatura {
    private double temperaturaCelcius; 
    private double temperaturaFahrenheit;
    private String tipoClima;
    
    public ConversorTemperatura() {
    }
    public ConversorTemperatura(int temperaturaCelcius) {
        this.temperaturaCelcius = temperaturaCelcius;
        temperaturaFahrenheit = temperaturaCelcius * 9 / 5 + 32;
    }
    public ConversorTemperatura(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
        temperaturaCelcius =(temperaturaFahrenheit - 32) * 5/9;
    }
    
    public double getTemperaturaCelcius() {
        return temperaturaCelcius;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }

    public String getTipoClima() {
        if(temperaturaFahrenheit < 64.4){
            tipoClima = "Clima é frio";
            
        }else if(temperaturaFahrenheit >= 66.2 && temperaturaFahrenheit <= 73.4){
            tipoClima = "Clima é agradável";
        }else if(temperaturaFahrenheit >= 75.2 && temperaturaFahrenheit <= 95){
            tipoClima = "Clima é quente";
        }else{
            tipoClima = "Clima é muito quente";
        }
        return tipoClima;
    }
}