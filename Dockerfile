FROM babashka/babashka:latest
WORKDIR /app
COPY backend.clj .
CMD ["bb", "backend.clj"]
