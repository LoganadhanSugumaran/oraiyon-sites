# oraiyan-sites

This is CRUD project for oraiyan sites

## Prerequisite

- Java 18
- MySQL DB
- Maven 3

## Running application locally

execute the main method in the com.oraiyan.siteservice.SiteServiceApplication class from your IDE.

Alternatively you can use the Spring Boot Maven plugin like so:
```bash
mvn spring-boot:run
```

## APIs

- /getSites - Gets a list of sites
- /getSites?areaid={areaId} - Gets a list of sites available in a particular area
- /getSites/{siteId} - Gets a particular site with siteid
- /getDealers - Gets a list of dealers
- /getDealers/{dealerId} - Gets a dealer with specific ID
- /getAreas - Gets all available areas

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)