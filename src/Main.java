import manito.Manito;

public class Main {
    public static void main(String[] args) {
        String[] people = {"김연희", "김예준", "신지수", "이상현", "임주환", "정소망", "정지민", "한상화", "황수현"};

        Manito myManito = new Manito(people);

        myManito.checkField();
    }
}