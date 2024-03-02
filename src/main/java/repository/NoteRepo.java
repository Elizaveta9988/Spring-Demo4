package repository;
    @Repository
    public interface NoteRepo extends JpaRepository<Note, Long> {

        /**
         * Найти заметку по id
         * @param id must not be {@literal null}.
         * @return возвращает заметку.
         */
        Optional<Note> findById(Long id);
}
