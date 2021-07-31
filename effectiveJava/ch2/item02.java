public class item02 {
    public static void main(String[] args) {
        buliderPattern study = new buliderPattern.Builder(1).two(2).three(3).four(4).build();
        System.out.println(study);
    }
}

/*
빌더 패턴
점층적 생정자 패턴과
자바빈즈 패턴의 장점을 모아서 만든 패턴
*/
class buliderPattern {
    private final int one;
    private final int two;
    private final int three;
    private final int four;

    public static class Builder {
        //필수 매개변수
        private final int one;

        //선택 매개변수 - 기본값으로 초기화한다.
        private int two = 0;
        private int three = 0;
        private int four = 0;

        public Builder(int one) {
            this.one = one;
        }

        public Builder two ( int val ) {
            this.two = val;
            return this;
        }

        public Builder three ( int val ) {
            this.three = val;
            return this;
        }

        public Builder four ( int val ) {
            this.four = val;
            return this;
        }

        public buliderPattern build(){
            return new buliderPattern(this);
        }
    }

    private buliderPattern(Builder builder) {
        one = builder.one;
        two = builder.two;
        three = builder.three;
        four = builder.four;
    }
}
