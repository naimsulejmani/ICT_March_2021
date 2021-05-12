package project.ict.kosovo.growth.model;

import java.time.LocalDateTime;

public abstract class BaseAudit<T> {
    protected T insertBy;//created_by; edhe int user: 1,2,3, username: naimsulejmani, mentorilai
    protected LocalDateTime insertDate;//createdAt;
    protected T updateBy; //modifiedBy
    protected LocalDateTime updateDate; //modifiedAt
    protected int updateNo;//modifiedNo

    public BaseAudit() {}

    public BaseAudit(T insertBy, LocalDateTime insertDate) {
        this.insertBy = insertBy;
        this.insertDate = insertDate;
    }

    public BaseAudit(T insertBy, LocalDateTime insertDate, T updateBy, LocalDateTime updateDate, int updateNo) {
        this.insertBy = insertBy;
        this.insertDate = insertDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.updateNo = updateNo;
    }

    public abstract void printAudit();
    //mundemi me shkru logger-in tone nese modifikohet
}
