# monitor-financas

## Building database image manually
```
docker build -t deevorak/finances-db:dev ./docker/db
docker run -p 6000:5432 -d --name finances-db deevorak/finances-db:dev
```