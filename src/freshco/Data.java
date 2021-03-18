package freshco;

class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String verData(){
        return (dia + "." + mes + "." + ano);
    }
    
    public void adicionarData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
}
