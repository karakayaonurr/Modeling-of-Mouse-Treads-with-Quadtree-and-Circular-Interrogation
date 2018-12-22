
import java.util.Random;
import javax.swing.JPanel;

public class QuadTree {

    Nokta kok;
    int Nesil1,Nesil2,Nesil3,Nesil4;

    QuadTree() {
        Nesil1 = Nesil2 = Nesil3 = Nesil4 = 0;
        
        this.kok = null;
    }

    void ekle(int x1, int y1, JPanel jp) {
        Nokta nokta_1 = kok;
        Nokta nokta_2 = nokta_1;
        if (nokta_1 == null) {
            kok = new Nokta(512, 512, x1, y1, Nesil1, jp);
        } else {
            while (true) {
                if (nokta_1.x == x1 || nokta_1.y == y1) {
                    break;
                }
                nokta_2 = nokta_1;
                if (x1 < nokta_1.x && y1 < nokta_1.y) {
                    if (nokta_1.c1 == null) {
                        Nesil3++;
                        nokta_1.c1 = new Nokta(nokta_2.a1, nokta_2.x, nokta_2.y, x1, y1, Nesil3, jp);
                        Nesil1 = Nesil2 = Nesil3 = Nesil4 = 0;
                        break;
                    } else {
                        nokta_1 = nokta_1.c1;
                        Nesil1++;Nesil2++;Nesil3++;Nesil4++;
                    }
                } else if (x1 < nokta_1.x && y1 > nokta_1.y) {
                    if (nokta_1.c2 == null) {
                        Nesil2++;
                        nokta_1.c2 = new Nokta(nokta_2.a1, nokta_2.x, nokta_2.y, x1, y1, Nesil2, jp);
                        Nesil1 = Nesil2 = Nesil3 = Nesil4 = 0;
                        break;
                    } else {
                        nokta_1 = nokta_1.c2;
                        Nesil1++;Nesil2++;Nesil3++;Nesil4++;
                    }
                } else if (x1 > nokta_1.x && y1 < nokta_1.y) {
                    if (nokta_1.c3 == null) {
                        Nesil4++;
                        nokta_1.c3 = new Nokta(nokta_2.a1, nokta_2.x, nokta_2.y, x1, y1, Nesil4, jp);
                        Nesil1 = Nesil2 = Nesil3 = Nesil4 = 0;
                        break;
                    } else {
                        nokta_1 = nokta_2.c3;
                        Nesil1++;Nesil2++;Nesil3++;Nesil4++;
                    }
                } else if (x1 > nokta_1.x && y1 > nokta_1.y) {
                    if (nokta_1.c4 == null) {
                        Nesil1++;
                        nokta_1.c4 = new Nokta(nokta_2.a1, nokta_2.x, nokta_2.y, x1, y1, Nesil1, jp);
                        Nesil1 = Nesil2 = Nesil3 = Nesil4 = 0;
                        
                        break;
                    } else {
                        nokta_1 = nokta_1.c4;
                        Nesil1++;Nesil2++;Nesil3++;Nesil4++;
                    }
                }
            }
        }
    }

    void RastgeleEkle(JPanel jp) {
        Random rastgele = new Random();
        int x1 = 0;
        int y1 = 0;
        int i = 0;
        while (i < 1) {
            x1 = rastgele.nextInt(512);
            y1 = rastgele.nextInt(512);
            Nokta nokta_1 = kok;
            Nokta nokta_2 = nokta_1;
            if (nokta_1 == null) {
                kok = new Nokta(512, 512, x1, y1, Nesil1, jp);
                i++;
            } else {
                while (true) {
                    if (nokta_1.x == x1 || nokta_1.y == y1) {
                        break;
                    }
                    nokta_2 = nokta_1;
                    if (x1 < nokta_1.x && y1 < nokta_1.y) {
                        if (nokta_1.c1 == null) {
                            Nesil3++;
                            nokta_1.c1 = new Nokta(nokta_2.a1, nokta_2.x, nokta_2.y, x1, y1, Nesil3, jp); 
                            Nesil1 = Nesil2 = Nesil3 = Nesil4 = 0;
                            i++;
                            break;
                        } else {
                            nokta_1 = nokta_1.c1;
                            Nesil1++;Nesil2++;Nesil3++;Nesil4++;
                        }
                    } else if (x1 < nokta_1.x && y1 > nokta_1.y) {
                        if (nokta_1.c2 == null) {
                            Nesil2++;
                            nokta_1.c2 = new Nokta(nokta_2.a1, nokta_2.x, nokta_2.y, x1, y1, Nesil2, jp);
                            Nesil1 = Nesil2 = Nesil3 = Nesil4 = 0;                            
                            i++;
                            break;
                        } else {
                            nokta_1 = nokta_1.c2;
                            Nesil1++;Nesil2++;Nesil3++;Nesil4++;
                        }
                    } else if (x1 > nokta_1.x && y1 < nokta_1.y) {
                        if (nokta_1.c3 == null) {
                            Nesil4++;
                            nokta_1.c3 = new Nokta(nokta_2.a1, nokta_2.x, nokta_2.y, x1, y1, Nesil4, jp);
                            Nesil1 = Nesil2 = Nesil3 = Nesil4 = 0;                            
                            i++;
                            break;
                        } else {
                            nokta_1 = nokta_2.c3;
                            Nesil1++;Nesil2++;Nesil3++;Nesil4++;
                        }
                    } else if (x1 > nokta_1.x && y1 > nokta_1.y) {
                        if (nokta_1.c4 == null) {
                            Nesil1++;
                            nokta_1.c4 = new Nokta(nokta_2.a1, nokta_2.x, nokta_2.y, x1, y1, Nesil1, jp);
                            Nesil1 = Nesil2 = Nesil3 = Nesil4 = 0;
                            i++;
                            break;
                        } else {
                            nokta_1 = nokta_1.c4;
                            Nesil1++;Nesil2++;Nesil3++;Nesil4++;
                        }
                    }
                }
            }
        }
    }
}
