.PHONY: build-events-monitoring

all: build-events-monitoring

build-events-monitoring:
	@find python/events-monitoring/src -type f -name '*_pb2.py' -exec rm {} \;
	@rm -r java/events-monitoring/src/main/java/*
	@protoc --proto_path=proto \
		--python_out=python/schemas/src/ \
		--java_out=java/events-monitoring/src/main/java/ \
		proto/parrotschemas/events_monitoring/v1/*.proto
