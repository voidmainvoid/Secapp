app.controller('controller2', function($scope, $http) {
    $scope.name="controller2";
    $scope.firstname="";
    $scope.names = [
                    {name:'Jani',country:'Norway'},
                    {name:'Hege',country:'Sweden'},
                    {name:'Kai',country:'Denmark'}
                ];
    $http.get('/airplane/manufacturers').
    then(function(response) {
        $scope.greeting = response.data;
    });
});