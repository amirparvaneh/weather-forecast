# weather-forecast

## Prerequisites

1. Install Docker on your machine
2. Run these commands to start containers:

```bash
# Start MySQL container (latest version)
docker run --name weather-mysql \
  -e MYSQL_ROOT_PASSWORD=rootpass \
  -e MYSQL_DATABASE=weather_db \
  -e MYSQL_USER=weather \
  -e MYSQL_PASSWORD=weatherpass \
  -p 3306:3306 \
  -d mysql:latest

# Start Redis container (latest version)
docker run --name weather-redis \
  -p 6379:6379 \
  -d redis:latest