public class Main {
    static void main(){


        Funcionario funcionario = new Funcionario();
        funcionario.setNome("joão");
        IO.println(funcionario.getnome());
        funcionario.setSalario(850);
        IO.println(funcionario.getSalario());
        funcionario.setCargo("técnico");
        IO.println(funcionario.getCargo());

    }
}
