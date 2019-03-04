public enum BoxType {
    X {
        public String toString() {
            return "X";
        }
    }, O {
        public String toString() {
            return "O";
        }
    }, NONE {
        public String toString() {
            return "-";
        }
    }
}
