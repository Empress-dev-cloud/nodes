package nodewithmusic;

public class nodenotes {

    static class Node {
        String song;
        Node next;
        Node(String s) { song = s; next = null; }
    }

    private Node head;

    void show() {
        Node steps = head;
        while (steps != null) {
            System.out.print(steps.song + " -------> ");
            steps = steps.next;
        }
        System.out.println("Null");
    }

    void add(String song) {
        Node n = new Node(song);
        if (head == null) { head = n; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = n;
    }

    void delete(String title) {
        if (head == null) return;
        if (head.song.equals(title)) { head = head.next; return; }
        Node cur = head;
        while (cur.next != null && !cur.next.song.equals(title)) cur = cur.next;
        if (cur.next != null) cur.next = cur.next.next;
    }

    public static void main(String[] args) {
        nodenotes playlist = new nodenotes();
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");

        System.out.println("Before inserting Song D:");
        playlist.show();

        playlist.add("Song D");
        System.out.println("After inserting Song D:");
        playlist.show();

        playlist.delete("Song B");
        System.out.println("After deleting Song B:");
        playlist.show();
    }
}
