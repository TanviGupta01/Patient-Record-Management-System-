# ER Diagram

[Patient]
- name
- age
- gender
- problem

Relationships:
PatientManager (1) ----- (*) Patient

Explanation:
The system stores multiple Patient records inside an ArrayList managed by PatientManager.
