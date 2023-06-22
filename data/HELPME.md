### CREATE BACKUPS OF VOLUMES DATA

* Keycloak
```console
foo@bar:~$ docker run --rm -v "$(pwd)/keycloak-server-data:/keycloak-server-data" -v "$(pwd):/backup" busybox tar -zcvf /backup/keycloak-server-data.tar.gz /keycloak-server-data
```

* Mongodb
```console
foo@bar:~$ docker run --rm -v "$(pwd)/mongodb-server-data:/mongodb-server-data" -v "$(pwd):/backup" busybox tar -zcvf /backup/mongodb-server-data.tar.gz /mongodb-server-data
```

* Grafana
```console
foo@bar:~$ docker run --rm -v "$(pwd)/grafana:/grafana" -v "$(pwd):/backup" busybox tar -zcvf /backup/grafana.tar.gz /grafana
```

* MYSQL
```console
foo@bar:~$ docker run --rm -v "$(pwd)/mysql-server-data:/mysql-server-data" -v "$(pwd):/backup" busybox tar -zcvf /backup/mysql-server-data.tar.gz /mysql-server-data
```

* Prometheus
```console
foo@bar:~$ docker run --rm -v "$(pwd)/prometheus:/prometheus" -v "$(pwd):/backup" busybox tar -zcvf /backup/prometheus.tar.gz /prometheus
```

<br>
### RESTORE BACKUPS OF VOLUMES DATA

* Keycloak
```console
foo@bar:~$ docker run --rm -v "$(pwd)/keycloak-server-data.tar.gz:/restore-volume/keycloak-server-data.tar.gz" -v "$(pwd):/restore" busybox tar -xvzf /restore-volume/keycloak-server-data.tar.gz -C /restore
```

* Mongodb
```console
foo@bar:~$ docker run --rm -v "$(pwd)/mongodb-server-data.tar.gz:/restore-volume/mongodb-server-data.tar.gz" -v "$(pwd):/restore" busybox tar -xvzf /restore-volume/mongodb-server-data.tar.gz -C /restore
```

* Grafana
```console
foo@bar:~$ docker run --rm -v "$(pwd)/grafana.tar.gz:/restore-volume/grafana.tar.gz" -v "$(pwd):/restore" busybox tar -xvzf /restore-volume/grafana.tar.gz -C /restore
```

* MYSQL
```console
foo@bar:~$ docker run --rm -v "$(pwd)/mysql-server-data.tar.gz:/restore-volume/mysql-server-data.tar.gz" -v "$(pwd):/restore" busybox tar -xvzf /restore-volume/mysql-server-data.tar.gz -C /restore
```

* Prometheus
```console
foo@bar:~$ docker run --rm -v "$(pwd)/prometheus.tar.gz:/restore-volume/prometheus.tar.gz" -v "$(pwd):/restore" busybox tar -xvzf /restore-volume/prometheus.tar.gz -C /restore
```

