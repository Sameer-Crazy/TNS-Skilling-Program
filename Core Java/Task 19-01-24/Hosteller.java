public class Hosteller extends Student{

    private int roomNumber;
    private char blockName;
    private String roomType;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public char getBlockName() {
        return blockName;
    }

    public void setBlockName(char blockName) {
        this.blockName = blockName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double calculateTotalFee(){
        double totalFee = 0;
        if(blockName=='A'){
            if(roomType.equals("AC")){
                totalFee = collegeFee + 60000 + 8000;
                
            }
            else{
                totalFee = collegeFee + 60000;
                
            }
        }
        else if(blockName=='B'){
            if(roomType.equals("AC")){
                totalFee = collegeFee + 50000 + 5000;
                
            }
            else{
                totalFee = collegeFee + 50000;
                
            }
        }
        else if(blockName=='C'){
            if(roomType.equals("AC")){
                totalFee = collegeFee + 40000 + 2500;
                
            }
            else{
                totalFee = collegeFee + 40000;
            }
        }
        return totalFee;
    }
    
    public Hosteller(int studentId, String studentName, String department, String gender, String category, double collegeFee, int roomNumber, char blockName, String roomType) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.roomNumber = roomNumber;
        this.blockName = blockName;
        this.roomType = roomType;
    }
}