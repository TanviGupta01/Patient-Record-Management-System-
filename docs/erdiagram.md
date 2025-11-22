# ER Diagram – Healthcare Patient Record Management System

## Entity: Patient
Attributes:
- name
- age
- gender
- problem

## Entity: PatientManager
Attributes:
- patientList (ArrayList of Patient objects)

## Relationship
PatientManager (1) ----- (*) Patient

Explanation:
The system stores multiple Patient records in memory using an ArrayList.
The PatientManager entity manages the collection of Patient objects.
Each PatientManager instance can contain many Patient entries, but each Patient belongs to only one PatientManager.

Cardinality:
1 PatientManager : Many Patients (1..*)
