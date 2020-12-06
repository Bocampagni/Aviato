# **Aviato**

Aviato is an _Open-Source_ travel agency API.

**How to setup it up**

* Postgres Docker container

First of all, download the postgres:alpine image from docker hub.

`docker pull postgres:alpine`

Then, build an instance of this image, so-called container.

`docker run --name aviato_db -e POSTGRES_PASSWORD=root -d -p 5432:5432 postgres:alpine`

* --name is related to container's name.
* -e is environment variable, in this case, the database password, you can choose one you like more instead of 'root'.
* -d is a reference to detached.
* -p is the port you using to run the docker process in your computer, after the ':' is the related container port which your database is running.

Let us enter in the postgres container

`docker exec -it aviato_db bash`

Once there, you can enter in the database

`psql -U postgres`

* postgres is the super user of this database

Finally, you can create a new database

`create database aviato;`

Now you have your database all settle.

##### Heading into the project itself

Lets clone it

`git clone https://github.com/Bocampagni/Aviato.git`

Then cd into it

`cd Aviato`

Now you are in the root of the project, you can play with it. To run the project, you can run the Maven wrapper executable file:

`mvn spring-boot:run`


**How to deploy this API**

After you change it, you can deploy this project following these steps.

In the root, execute:

`mvn compile`

You will have the .class file, but you cannot do much with it.

`mvn package`

Will generate the .JAR file. It will be in the target directory.

Finally, in order to run it, you can use

`java -jar {your .JAR here}`
