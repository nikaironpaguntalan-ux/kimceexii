public class CaseRec {
    protected String caseID;
    protected String caseType;
    protected String caseNature;
    protected String Accused;
    protected String Complainant;
    protected String status;
    protected String Prosecutor;
    protected String Judge;
    protected String filedDate;
    public CaseRec(String caseID, String caseType, String caseNature, String Accused, String Complainant, String status, String Prosecutor, String Judge, String filedDate){
        this.caseID = caseID;
        this.caseType = caseType;
        this.caseNature = caseNature;
        this.Accused = Accused;
        this.Complainant = Complainant;
        this.status = status;
        this.Prosecutor = Prosecutor;
        this.Judge = Judge;
        this.filedDate = filedDate;
    }
    public String getCaseID(){
        return caseID;
    }
    public String getCaseType(){
        return caseType;
    }
    public String getCaseNature(){
        return caseNature;
    }
    public String getAccused(){
        return Accused;
    }
    public String getComplainant(){
        return Complainant;
    }
    public String getStatus(){
        return status;
    }
    public String getProsecutor(){
        return Prosecutor;
    }
    public String getJudge(){
        return Judge;
    }
    public String getFiledDate(){
        return filedDate;
    }
    
}
