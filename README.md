# Patient-Management-System
Expected to implement a “Patient Management System” using Data Structures with Java


Assume that there is a patient system that manages the patients and their appointments.
Patients have their appointment dates and times. They also have various priorities according
to their pregnancy state, disability state, and age. Priority conditions are listed below. You are
expected to implement a management system in which each patient is sorted according to
his/her appointment information and priority condition in order to be taken care of by the
doctor. The patient who has an earlier appointment date and time will be placed before.

The patients will be listed according to their appointment first and their priority conditions
after that: 

  | Condition  | Priority |
  | ---------- | -------- |
  | Disabled   | 5        |
  | Over 65    | 4        |
  | Pregnant   | 3        |
  | Under 18   | 2        |
  | Regular    | 1        |
  
  :bangbang:5 means the highest priority, 1 means the lowest priority.
  
  1. For each patient, compare appointment date and appointment time. (You can use
     Java LocalDateTime; import java.time.LocalDateTime) Put them to a list in a way that
     all patients are ordered according to their appointment (date and time) from earliest
     to latest. In order to do so, read the **_“records.txt”_** file, which has the following format:
    
          name_surname, age, gender, pregnancy, disability, date, time
          
  2. After creating the list, **print** the listed patients with all their information.

  3. Create **a waiting line of patients**. Determine the priorities of patients that are on the
     list and locate them in a waiting line of patients. When the waiting line is completed,
     the patient that has high priority should be taken care of first. A patient who has an
     earlier date and time is going to receive treatment before. In the case of two or more
     patients having an appointment on the same day, the patient who has the highest
     priority because of his/her condition is going to get treatment first. You must consider
     both the priority conditions and appointment (time and date) at the same time.
     Consider each day separate from other days while managing priority conditions.
     
  4. After creating the waiting line of patients, **print** the line of patients according to their
     order of receiving treatment this time with all their information.

  5. If one patient leaves the hospital before the treatment, the next one after that should
     get his/her turn. The turn should not be empty. Consider this situation while creating
     the waiting line of patients.
     
  6. After every 5 treatments, **print** the remaining patients on the list. (print remaining
     patients after 5., 10., 15. patients received treatment and also the final patient that
     received treatment).




    
