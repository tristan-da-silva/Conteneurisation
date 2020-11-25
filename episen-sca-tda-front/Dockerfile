FROM node:alpine AS my-app-build  
RUN addgroup -g 2020 docker && adduser -u 2020 -G docker -h /home/tp4 -D docker
WORKDIR /home/tp4  
COPY . .
RUN npm ci && npm run build

FROM nginx:alpine
USER docker
COPY --from=my-app-build home/tp4/dist/episen-sca-tda-front /usr/share/nginx/html
EXPOSE 80

LABEL description="For Nginx alpine version" episen-sca-tda-front.version="1.0.0" date="23/11/2020"