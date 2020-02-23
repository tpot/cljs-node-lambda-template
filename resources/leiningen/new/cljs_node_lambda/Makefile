EVENT ?= {}

build: index.js

run: build node_modules
	docker run --rm \
		-e AWS_ACCESS_KEY_ID -e AWS_SECRET_ACCESS_KEY -e AWS_SESSION_TOKEN \
		-v $(shell pwd):/var/task:ro,delegated \
		lambci/lambda:nodejs12.x index.handler '$(EVENT)'

index.js: src/{{sanitized}}/main.cljs
	lein cljsbuild once {{sanitized}}

archive.zip: index.js node_modules
	rm -f archive.zip
	zip -jq archive.zip index.js
	zip -rq archive.zip node_modules

node_modules:
	lein npm install

clean:
	rm -rf target node_modules archive.zip index.js
