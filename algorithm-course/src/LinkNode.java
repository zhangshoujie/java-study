public static int FindMax(Node head) {
        if (head == null)
            return 0;
        int Max = head.value;
        while (head.next != null) {
            if (head.next.value > Max)
                Max = head.next.value;
            head = head.next;
        }
        return Max;
    }
