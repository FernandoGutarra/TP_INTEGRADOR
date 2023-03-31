package models;

public class ResultadoEnum {
    private int golesEquipoX;
    private int golesEquipo2;
    public ResultadoEnum(int golesEquipoX,int golesEquipo2){
        this.golesEquipoX=golesEquipoX;
        this.golesEquipo2=golesEquipo2;
    }
    public String ResultadoGanador(){
        if(this.golesEquipoX>this.golesEquipo2){
            System.out.println(golesEquipoX+"RESULTADOX");
            System.out.println(golesEquipo2+"RESULTADO2");
            return "ganador";
        } else if (this.golesEquipoX<this.golesEquipo2) {
            return "perdedor";
        } else {
           return "empate";
        }
    }
}
