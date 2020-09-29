class test2 {

        public static int findMaxNodeCount(LinkListClass<Integer> list) {
            LinkNode<Integer> p = list.head;
            Integer maxValue = list.head.next.data;
            int count = 1;
            while (p.next != null) {
                System.out.println("=====Node=====>" + p.next.data);
                if (p.next.data > maxValue) {
                    maxValue = p.next.data;
                    count = 1;
                } else if (p.next.data.equals(maxValue)) {
                    count++;
                }
                p = p.next;
            }
            System.out.println("===MaxValue===>" + maxValue);
            return count;
        }

        public static int findMaxNodeCountEx(LinkListClass<Integer> list) {
            LinkNode<Integer> p = list.head;
            Integer maxValue = list.head.next.data;
            int count = 1;
            while (p.next != null) {
                System.out.println("=====Node=====>" + p.next.data);
                if (p.next.data > maxValue) {
                    maxValue = p.next.data;
                    count = 1;
                } else if (p.next.data.equals(maxValue)) {
                    count++;
                }
                p = p.next;
            }
            System.out.println("===MaxValue===>" + maxValue);
            return count;
        }

        public static void main(String[] args) {
            LinkListClass<Integer> linkList1 = new LinkListClass<>();
            linkList1.add(new LinkNode<>(1));
            linkList1.add(new LinkNode<>(2));
            linkList1.add(new LinkNode<>(3));
            linkList1.add(new LinkNode<>(3));
            linkList1.add(new LinkNode<>(3));
            linkList1.add(new LinkNode<>(4));
            System.out.println("================>最大值Node个数" + findMaxNodeCount(linkList1));

            LinkListClass<Integer> linkList2 = new LinkListClass<>();
            linkList2.addArray(new Integer[]{1, 2, 3, 4, 5, 5, 5});

            System.out.println("================>最大值Node个数" + findMaxNodeCount(linkList2));

            LinkListClass<Integer> linkList3 = new LinkListClass<>(new Integer[]{1, 2, 3, 4, 5, 5, 5});
            System.out.println("================>最大值Node个数" + findMaxNodeCount(linkList3));

        }
    }
    class LinkNode<E> {
        E data;
        LinkNode<E> next;

        public LinkNode(E d) {
            this.data = d;
            this.next = null;
        }

        public LinkNode() {
            this.next = null;
        }

        public LinkNode(E data, LinkNode<E> next) {
            this.next = next;
            this.data = data;
        }
    }
    class LinkListClass<E> {
        LinkNode<E> head;
        LinkNode<E> point;

        public LinkListClass() {
            head = new LinkNode<E>();
            head.next=null;
        }

        public LinkListClass(E[] array){
            head = new LinkNode<E>();
            head.next=null;
            addArray(array);
        }

        public void add(LinkNode<E> node) {
            if(head.next == null){
                this.head.next = node;
                this.point = this.head.next;
            }else{
                this.point.next = node;
                this.point = node;
            }
        }

        public void addArray(E[] array) {
            for(E e : array){
                add(new LinkNode<>(e));
            }
        }
    }


}