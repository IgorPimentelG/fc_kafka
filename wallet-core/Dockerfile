FROM golang:1.20

WORKDIR /app/

COPY go.mod go.sum ./
RUN go mod tidy
COPY . ./

RUN apt-get update && apt-get install -y librdkafka-dev && apt-get clean
RUN go build -o walletcore cmd/walletcore/main.go

CMD ["./walletcore"]