.PHONY: build-events-monitoring


build-events-monitoring:
	@protoc --proto_path=proto --python_out=python/events-monitoring/src/ --java_out=java/events-monitoring/src/main/java/ proto/events_monitoring/v1/*.proto
