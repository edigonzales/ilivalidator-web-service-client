# ilivalidator-web-service-client

- ENV Variablen müssen gesetzt sein: -e AWS_ACCESS_KEY_ID=XXXXXXXXXXXXX -e AWS_SECRET_ACCESS_KEY=YYYYYYYYYYYY -e AWS_REGION=eu-central-1

## todo
- ~~Lambda in Gradle build integrieren.~~ won't fix
- ~~Lambda Qualifiers~~
- ~~Lambda max / reserved concurrency~~
- ~~Ilivalidator~~
- ~~Ilivalidator extension functions (à la GRETL?)~~
- CI/CD Github Action
- Tests
  * ~~Grundlage~~
  * Testfälle von ilivalidator-webservice. In diesem nur noch einfachste Fälle.
- Dokumentation
  * policy, role...
  * ili_cache directory (env oder im Code setzen -> siehe Blog)
  * ili und toml
- AWS Parameter Store (v.a. für Spring Boot Teil)
- ~~Cloudwatch logs aufräumen?~~ Kosten?
- Cloudformation
  * Parametrisieren
  * ~~Aliasnamen (Zuerst das System verstehen und wie Deployment funktioniert).~~
  * ...
- Welcher User im Web Service? Welche Policies?
  * AGI User darf Lambda-Funktionen ausführen
- Lambda Logging? Context?
- Error Handling
- sam scheint einfacher als Cloudformation, inkl. API-Gateway (falls benötigte). Siehe Quarkus.
