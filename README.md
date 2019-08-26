## Requirement

- please forked this repo for practice
- use MyBatis to implement `POST /employees` and `GET /employees`

##  Practice Output & Submit

- submit your git repo url to field `answer`

## Hint

- create `Entity` to present your data structure
- create `Repository` for MyBatis integration 
- create `Mapper` under resources package 
- write sql statements 
- use `Repository` for your business to access to database

## How to use H2

- `schema.sql` will be loaded and init database when application is starting
- navigate to web console`http://localhost:8080/h2-console`
- put `jdbc:h2:mem:tws_persistence_db` in `JDBC URL` field
