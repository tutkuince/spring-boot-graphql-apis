## Graphql
GraphQL is a query language for APIs or a syntax that describes how to ask for data and is generally used to load data from a server to a client. GraphQL offers maximum efficiency and flexibility because it allows the calling client to specify exactly what data it needs.

#### Graphql Dependencies

- graphql-spring-boot-starter
    - This starter is very helpful because it will add and automatically configure a GraphQL Servlet that you can access at /graphql . This starter will also use a GraphQL schema library to parse all schema files found on the classpath. The starter will also set up an endpoint that can access POST requests. 

- graphql-java-tools
    - A helper library to parse the GraphQL schema. 

#### Schemas
The GraphQL schema defines the data points offered via an API. The schema contains the data types and relationships between them and the set of operations available, things like queries for retrieving data and mutations for creating, updating, and deleting data.

#### Operations
GraphQL offers operations on data like queries and mutations.

#### Queries
A query allows for the retrieving of data. Each query will have a specific object that it returns and based on the object returned, you can add or remove fields to match the exact data you need to fit your specific use case.

#### Mutations
GraphQL has the ability to update the data stored on the server, by means of mutations. Mutations, such as, create, update, or delete will change the data, unlike a query.

#### GraphiQL
A tool called GraphiQL is a simple web app that is able to communicate with any GraphQL Server and execute queries and mutations against it.

