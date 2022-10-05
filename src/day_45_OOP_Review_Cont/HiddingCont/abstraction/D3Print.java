package day_45_OOP_Review_Cont.HiddingCont.abstraction;
    public abstract class D3Print {
        String model;
        String fileFormat;
        static int counterModel;
        public D3Print(String model, String fileFormat) {
            this.model = model;
            this.fileFormat = fileFormat;
        }
        public abstract void extrude();
        public abstract void polish();
        public static int counter(){
            counterModel++;
            return counterModel;
        }
        public String fileFormatCheck(){
            if(fileFormat.equals("OBJ")){
                return "file format is suitable for poishing";
            }else {
                return "file format is not suitable for polishing";
            }
        }
    }

