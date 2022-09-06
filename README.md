# How to reproduce a bug

Build the micronaut native-image application:
```
./gradlew nativeCompile
```

Run the micronaut native-image application:
```
./build/native/nativeCompile/graphql-native-bug
```

Open the url http://localhost:8080/graphiql

Execute the graphql query:
```
{
  products {
    id
    extId
    kind
  }
}
```

Actual result:
```
{
  "errors": [
    {
      "message": "The field at path '/products[0]/id' was declared as a non null type, but the code involved in retrieving data has wrongly returned a null value.  The graphql specification requires that the parent field be set to null, or if that is non nullable that it bubble up null to its parent and so on. The non-nullable type is 'ID' within parent type 'Product'",
      "path": [
        "products",
        0,
        "id"
      ],
      "extensions": {
        "classification": "NullValueInNonNullableField"
      }
    },
    {
      "message": "The field at path '/products[0]/extId' was declared as a non null type, but the code involved in retrieving data has wrongly returned a null value.  The graphql specification requires that the parent field be set to null, or if that is non nullable that it bubble up null to its parent and so on. The non-nullable type is 'String' within parent type 'Product'",
      "path": [
        "products",
        0,
        "extId"
      ],
      "extensions": {
        "classification": "NullValueInNonNullableField"
      }
    },
    {
      "message": "The field at path '/products[0]/kind' was declared as a non null type, but the code involved in retrieving data has wrongly returned a null value.  The graphql specification requires that the parent field be set to null, or if that is non nullable that it bubble up null to its parent and so on. The non-nullable type is 'String' within parent type 'Product'",
      "path": [
        "products",
        0,
        "kind"
      ],
      "extensions": {
        "classification": "NullValueInNonNullableField"
      }
    }
  ],
  "data": {
    "products": [
      null
    ]
  }
}
```

Expected result:
```json
{
  "data": {
    "products": [
      {
        "id": "1",
        "extId": "Ext34",
        "kind": "Kind2"
      }
    ]
  }
}
```

## Micronaut 3.6.2 Documentation

- [User Guide](https://docs.micronaut.io/3.6.2/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.6.2/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.6.2/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)


## Feature graphql documentation

- [Micronaut GraphQL documentation](https://micronaut-projects.github.io/micronaut-graphql/latest/guide/index.html)


## Feature reactor documentation

- [Micronaut Reactor documentation](https://micronaut-projects.github.io/micronaut-reactor/snapshot/guide/index.html)


