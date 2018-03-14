# hydra-assessment-service
The Assessment Service can retrieve all Assessments objects in a table, return an object based on assessment id, 
a trainer can only create an assessment object, an Assessment can be deleted, an Assessment can be updated, and find an assessment by week. 
The Assessment bean contains the Assessment id, title, batch, raw Score, Assessment type, week , category , and a set of grades. 
The Assessment type is Verbal, Exam, Project, Other.

## Related services
The Assessment service communicates with the Batch, Skills and Grade services to construct the complex Assessment object.
