package OOPS.POLYMORPHISM;

public class Overriding {
    static class bank {
        void RateOfIntrest() {
            System.out.println("BANK ROI IS 15%");
        }
    }

        static class SBI extends bank {
        @Override
        void RateOfIntrest() {
            System.out.println("SBI ROI IS 6%");
        }
    }

        static class HDFC extends bank {
            @Override
        void RateOfIntrest() {
           System.out.println("HDFC ROI IS 5%");
            }
    }

            static class PNB extends bank{
                @Override
            void RateOfIntrest() {
                System.out.println("PNB ROI IS 8%");
                }
            }

            public static void main(String[] args) {
                bank obj = new bank();
                SBI obj1 = new SBI();
                HDFC obj2 = new HDFC();
                PNB obj3 = new PNB();

                obj.RateOfIntrest();
                obj1.RateOfIntrest();
                obj2.RateOfIntrest();
                obj3.RateOfIntrest();
            }
        }