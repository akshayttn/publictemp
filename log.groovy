def info(message) {
    echo "\033[31m${message}\033[31m\n"
}



def warn(message) {
    echo "\033[31m${message}\033[31m\n"
}

def gitId(message) {
    echo "Git commit id: \033[31m${message}\033[31m\n"
}
