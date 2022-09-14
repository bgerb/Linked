/*
public class Main {
    public static void main(String[] args) {
        Linked temp = new Linked();
        temp.append(5);
        temp.append(6);
        temp.append(3);
        temp.append(8);
        temp.append(13);
        temp.append(12);
        temp.append(17);
        temp.append(5);
        temp.append(9);
        temp.append(10);
        temp.append(11);
        temp.append(4);
        temp.append(3);
        System.out.println(Linked.fullprint(temp));
        Linked.Nodesearch(temp, 11);
        temp.delete(temp.Nodess(temp,3));
        temp.delete(temp.Nodess(temp,3));
        System.out.println(Linked.fullprint(temp));



    }
}

 */
class Main {
    public static void main(String[] args) {

        Node fe = new Node(null, null, 3);

        if(testConstructor()) pass++;
        else fail++;

        if(testSearch()) pass++;
        else fail++;

        if(testSearchne()) pass++;
        else fail++;

        if(testSearchte()) pass++;
        else fail++;

        if(testdelete1()) pass++;
        else fail++;

        if(testdelete2()) pass++;
        else fail++;





        System.out.println(" passed : " + pass + " fails: " + fail);





        }

static int pass = 0;
static int fail = 0;

public static boolean testdelete1() {
        Linked fl = new Linked();
        fl.append(3);
        fl.append(4);
        fl.delete(fl.Nodess(fl,3));
        return fl.Nodesearch(3) == null;
        }

public static boolean testdelete2() {
        Linked fl = new Linked();
        fl.append(3);
        fl.append(4);
        fl.delete(fl.Nodess(fl,3));
        return fl.Nodesearch(3) == fl.Nodess(fl,3);

        }

public static boolean testSearchne() {
        Linked fl = new Linked();
        fl.append(3);
        return fl.Nodesearch(3) == fl.Nodess(fl,3);

        }

public static boolean testSearchte() {
        Linked fl = new Linked();

        fl.append(3);
        fl.append(4);
        return fl.Nodesearch(3) == fl.Nodess(fl,3);

        }

public static boolean testSearch() {
        Linked fl = new Linked();

        return fl.Nodesearch(3) == null;

        }

public static boolean testConstructor() {
        Linked fe = new Linked();
        return fe.getHead() == null && fe.getTail() == null;

        }


        }