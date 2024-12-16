public class BuilderRobots {
        private int canon;
        private int shield;
        private int freq;
        private String name;
        private int life;

        public BuilderRobots setCanon(int canon) {
            this.canon = canon;
            return this;
        }

        public BuilderRobots setShield(int shield) {
            this.shield = shield;
            return this;
        }

        public BuilderRobots setFreq(int freq) {
            this.freq = freq;
            return this;
        }

        public BuilderRobots setName(String name) {
            this.name = name;
            return this;
        }

        public BuilderRobots setLife(int life) {
            this.life = life;
            return this;
        }

        public Robot build() {
            return new Robot() {
                @Override
                public int getCanon() {
                    return canon;
                }

                @Override
                public int getShield() {
                    return shield;
                }

                @Override
                public int getFreq() {
                    return freq;
                }

                @Override
                public String getName() {
                    return name;
                }

                @Override
                public int diffLife(int i) {
                    life += i;
                    return life;
                }
            };
        }


}
