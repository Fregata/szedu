
function UserListCtrl($scope, User) {
    $scope.users = User.query();
     
    $scope.delAdmin = function(admin) {
    	if(!confirm("Are you sure you want to delete selected admin?"))
            return;

        var handleDeleteComplete = function(admin) {
            $scope.users.remove(admin);
            $scope.message = "Delete complete";
        }

        var deleteAdmin = function(admin) {
            admin.$delete(handleDeleteComplete,handleError);
        }

        deleteAdmin(admin);
    }

     var handleError = function(resp) {
        if(resp.data && resp.data.message)
            $scope.message = resp.data.message;
        else
            $scope.message = "Server Error";
    }

}

function UserAddCtrl($scope, $routeParams, $rootScope, $location, User) {
    $rootScope.message = null;
    var id = $routeParams['adminid'];
    $scope.user = User.get({ adminid: id });

    ///$scope.widgets = Widget.query();
    $scope.addAdmin = function(admin) {
        admin.$save(function(admin) {
            $scope.users.push(admin);
            $scope.user = null;
        },handleError);
    }

    var handleError = function(resp) {
        if(resp.data && resp.data.message)
            $scope.message = resp.data.message;
        else
            $scope.message = "Server Error";
    }

}

function UserEditCtrl($scope, $routeParams, $rootScope, $location, User) {
    $rootScope.message = null;
    var id = $routeParams['adminid'];
    $scope.user = User.get({ adminid: id });

    ///$scope.widgets = Widget.query();
    $scope.uptAdmin = function(admin) {
        admin.$save(function(admin) {
            $rootScope.message = "Update [" + admin.adminname + "] complete";
            $location.path("/");
        },handleError);
    }

    var handleError = function(resp) {
        if(resp.data && resp.data.message)
            $scope.message = resp.data.message;
        else
            $scope.message = "Server Error";
    }

}