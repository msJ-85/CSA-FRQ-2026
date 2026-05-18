public class Attendance {
    /* The students enrolled in a history course */ 
    private ArrayList<CourseRecord> historyList; 
    
    /* The students enrolled in a math course */ 
    private ArrayList<CourseRecord> mathList; 

    /** 
     * Returns the number of students who are enrolled in both
     * the history course and the math course but have more
     * absences in the history course than the math course
     * Preconditions: 
     *      No student ID appears multiple times in historyList. 
     *      No student ID appears multiple times in mathList. 
     *      historyList and mathList do not contain any null elements.
     * Postcondition: 
     *      historyList and mathList are unchanged. 
     */
    public int moreHistoryThanMathAbsences() { 
        int count = 0;
        for(int h = 0; h < historyList.size(); h++){
            String hId = historyList.get(h).getStudentID();
            int hAbsences = historyList.get(h).getAbsences();
            for(int m= 0; m< mathList.size(); m++){
                String mId = historyList.get(m).getStudentID();
                int mAbsences = historyList.get(m).getAbsences();
                if(hId.equals(mId) && h > mAbsences) {
                    count++;
                }
            }
        }
        return count;
    } 
    
    /* There may be instance variables, constructors, and methods that are not shown. */
}
