package introducaoCursoJava.applicationEncapsulamento;

public class Test {
    public static void main(String[] args) {
        Encapsulamento encapsulamento = new Encapsulamento("Leozym", 25);
        System.out.println(encapsulamento.getNome());
        System.out.println(encapsulamento.getIdade());
        System.out.println("---------");
        encapsulamento.setNome("King of Thais");
        encapsulamento.setIdade(999);
        System.out.println(encapsulamento.getNome());
        System.out.println(encapsulamento.getIdade());
    }
}
