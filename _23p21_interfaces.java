public class _23p21_interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Elephant e = new Elephant();
        e.moves();
        King k = new King();
        k.moves();
    }
}

interface ChessPlayer {
    void moves();// By deafult, it is public, abstract and we can't write its implementation
                 // inside the interface ChessPlayer
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen can move in any direction n no. of steps");
    }
}

class Elephant implements ChessPlayer {
    public void moves() {
        System.out.println("Elephant can move in left, right,up,down n no. of steps");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("King can move 1 step in any direction");
    }
}