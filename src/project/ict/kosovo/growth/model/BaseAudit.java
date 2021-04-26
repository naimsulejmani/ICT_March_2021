package project.ict.kosovo.growth.model;

import java.time.LocalDateTime;

public class BaseAudit {
    protected String insertBy;//created_by; edhe int user: 1,2,3, username: naimsulejmani, mentorilai
    protected LocalDateTime insertDate;//createdAt;
    protected String updateBy; //modifiedBy
    protected LocalDateTime updateDate; //modifiedAt
    protected int updateNo;//modifiedNo

    //mundemi me shkru logger-in tone nese modifikohet
}
