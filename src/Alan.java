
public class Alan {

    int ust;
    int alt;
    int sol;
    int sag;

    Alan(int x1, int y1, int x2, int y2) {
        this.alt = y1 - y2;
        this.ust = y2;
        this.sag = x1 - x2;
        this.sol = x2;
    }

    Alan(Alan a1, int x1, int y1, int x2, int y2) {
        if (x2 < x1 && y2 < y1) {
            ust = a1.ust - (y1 - y2);
            alt = y1 - y2;
            sol = a1.sol - (x1 - x2);
            sag = x1 - x2;

        }
        if (x2 < x1 && y2 > y1) {
            ust = y2 - y1;
            alt = a1.alt - (y2 - y1);
            sol = a1.sol - (x1 - x2);
            sag = x1 - x2;

        }
        if (x2 > x1 && y2 < y1) {
            ust = a1.ust - (y1 - y2);
            alt = y1 - y2;
            sag = a1.sag - (x2 - x1);
            sol = x2 - x1;

        }
        if (x2 > x1 && y2 > y1) {
            sag = a1.sag - (x2 - x1);
            sol = x2 - x1;
            alt = a1.alt - (y2 - y1);
            ust = y2 - y1;
        }
    }
}