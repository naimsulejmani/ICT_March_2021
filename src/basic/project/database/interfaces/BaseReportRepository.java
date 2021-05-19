package basic.project.database.interfaces;

import java.util.List;

public interface BaseReportRepository<T> {
    int getCompletedTodosNumber();
    List<T> getTodosSummaryByDate();
    /*
        DueDate       No     Completed      NotCompleted
        19-05-2021     50      35               15
        20-05-2021     33       0               33
     */
}
