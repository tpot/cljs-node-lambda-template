# cljs-node-lambda

A Leiningen template for executing AWS Lambda functions in ClojureScript.

## Usage

Run `lein new cljs-node-lambda foo` to create a template project that
will display a test message and exit successfully.

Use the `run` target in the template `Makefile` to execute the Lambda
function inside a Docker container from the excellent
[lambci/docker-lambda](https://github.com/lambci/docker-lambda)
project. This allows you to test the function locally without having
to package and deploy the code to AWS. The AWS credentials environment
variables triplet are passed through to the container to allow the
function to make AWS API calls.

## License

```
Copyright © 2020 Tim Potter <tim.potter@viasat.com>

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
```
