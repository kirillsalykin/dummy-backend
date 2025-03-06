TS=$(date -u +"%s")
docker build -t dummy-backend:${TS} .
docker tag dummy-backend:${TS} ghcr.io/kirillsalykin/dummy-backend:${TS}
docker push ghcr.io/kirillsalykin/dummy-backend:${TS}
