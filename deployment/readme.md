## Prerequisites:
1. Have the image readily available: moldovean/greetings:latest

## Instructions:

### Create Cluster
run in a new terminal `cloud-provider-kind`, this allows to create serivces of type LoadBalancer

`kind create cluster --name demo` 

### Apply your deployments
`kubectl apply -f deployment.yaml`

`kubectl apply -f service.yaml`

### Apply persistent sets
`kubectl get storageclass`

`kubeclt apply -f persistent-volume.yaml`
`kubectl apply -f postgres-config-map.yaml postgres-deployment.yaml postgres-service.yaml`

You can then enter inside the pod:
`kubectl exec -it postgres-0 bash`
`psql --username=admin postgresdb`

### Enjoy
`kubectl get all`