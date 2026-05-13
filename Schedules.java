public class Schedules {
    protected String datetime;
    protected String caseID;
    protected String ReSched;
    public Schedules(String datetime, String caseID, String ReSched){
        this.datetime = datetime;
        this.caseID = caseID;
        this.ReSched = ReSched;
    }
    public String getDatetime(){
        return datetime;
    }
    public String getCaseID(){
        return caseID;
    }
    public String getReSched(){
        return ReSched;
    }
    

    
}
